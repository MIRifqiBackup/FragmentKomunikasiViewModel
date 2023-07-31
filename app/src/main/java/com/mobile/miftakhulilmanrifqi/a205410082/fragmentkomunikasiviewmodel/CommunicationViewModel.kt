package com.mobile.miftakhulilmanrifqi.a205410082.fragmentkomunikasiviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {
//    KANAN

    // Nama
    private val mNameKanan = MutableLiveData<String>()

    val nameKanan: LiveData<String>
        get() = mNameKanan

    fun setNameKanan(nameKanan: String) {
        mNameKanan.value = nameKanan
    }

    // NIM
    private val mNimKanan = MutableLiveData<String>()

    val nimKanan: LiveData<String>
        get() = mNimKanan

    fun setNimKanan(nimKanan: String) {
        mNimKanan.value = nimKanan
    }

//    KIRI

    // Nama
    private val mNameKiri = MutableLiveData<String>()

    val nameKiri: LiveData<String>
        get() = mNameKiri

    fun setNameKiri(nameKiri: String) {
        mNameKiri.value = nameKiri
    }

    // NIM
    private val mNimKiri = MutableLiveData<String>()

    val nimKiri: LiveData<String>
        get() = mNimKiri

    fun setNimKiri(nimKiri: String) {
        mNimKiri.value = nimKiri
    }
}
