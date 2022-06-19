/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class AudioMediaTransmitParam {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AudioMediaTransmitParam(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AudioMediaTransmitParam obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_AudioMediaTransmitParam(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setLevel(float value) {
    pjsua2JNI.AudioMediaTransmitParam_level_set(swigCPtr, this, value);
  }

  public float getLevel() {
    return pjsua2JNI.AudioMediaTransmitParam_level_get(swigCPtr, this);
  }

  public AudioMediaTransmitParam() {
    this(pjsua2JNI.new_AudioMediaTransmitParam(), true);
  }

}
