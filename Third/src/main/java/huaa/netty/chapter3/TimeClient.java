package huaa.netty.chapter3;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

public class TimeClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int port = 50200;
		new TimeClient().connect("localhost", port);

	}
	
	public void connect(String host, int port) throws Exception {
		EventLoopGroup group = new NioEventLoopGroup(2);
		try {
			Bootstrap b = new Bootstrap();
			b.group(group).channel(NioSocketChannel.class)
				.option(ChannelOption.TCP_NODELAY, true)
				.handler(new ChannelInitializer<SocketChannel>() {

					@Override
					protected void initChannel(SocketChannel ch) throws Exception {
						// TODO Auto-generated method stub
						ch.pipeline().addLast(new TimeClientHandler());
					}
				});
			
			ChannelFuture f = b.connect(host, port).sync();
			f.channel().closeFuture().sync();			
		} finally {
			group.shutdownGracefully();
		}
	}

}
