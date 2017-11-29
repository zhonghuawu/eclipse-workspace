/* This file contains the C version of the test() method. */
#include <jni.h>
#include "NativeDemo.h"
#include <stdio.h>

JNIEXPORT void JNICALL Java_com_huaa_other_NativeDemo_test(JNIEnv *env, jobject obj)
{
	jclass cls;
	jfieldID fid;
	jint i;

	printf("Starting the native method.\n");
	cls = (*env)->GetObjectClass(env, obj);
	fid = (*env)->GetFiedID(env, cls, "i", "I");

	if(fid == 0)
	{
		printf("Could not get field id.\n");
		return;
	}

	i = (*env)->GetIntField(env, obj, fid);
	printf("i = %d\n", i);

	(*env)->SetIntField(env, obj, fid, 2*i);
	printf("Ending the native method.\n");
}