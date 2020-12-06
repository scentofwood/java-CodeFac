#include <stdio.h>
#include "EgParameterJNI.h"

JNIEXPORT jint JNICALL Java_EgParameterJNI_CalParameter
  (JNIEnv *env, jobject jobj, jint num1, jint num2 , jstring strOpr)
{
    char *pOpr;
    int sum;
    
    // C
    pOpr = (*env)->GetStringUTFChars(env, strOpr, 0);
    // C++
    // pOpr = env->GetStringUTFChars(env, 0);

    printf("STRING1(%s)\n", pOpr);
    // 가상머신에게 더 이상 UTF-8 포맷 문자열 pOpr을 사용하지 않는다고 알려준다
    (*env)->ReleaseStringUTFChars(env, strOpr, pOpr);

    if (pOpr[0] == '*') sum = num1 * num2;
    return sum;
}

JNIEXPORT jstring JNICALL Java_EgParameterJNI_Message
  (JNIEnv *env, jobject jobj, jstring message)
{
    char *pMsg;
    char strBuf[128] = "Return Message";
    
    // C
    pMsg = (*env)->GetStringUTFChars(env, message, 0);
    // C++
    // pMsg = env->GetStringUTFChars(message, 0);

    printf("STRING2(%s)\n", pMsg);

    // C
    return (*env)->NewStringUTF(env, strBuf);
    // C++
    // return env->NewStringUTF(strBuf);
}

