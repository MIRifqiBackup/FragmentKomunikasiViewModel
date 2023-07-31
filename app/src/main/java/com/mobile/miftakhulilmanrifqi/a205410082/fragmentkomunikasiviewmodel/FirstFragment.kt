package com.mobile.miftakhulilmanrifqi.a205410082.fragmentkomunikasiviewmodel

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders

import com.google.android.material.textfield.TextInputEditText

class FirstFragment : Fragment() {
    private var communicationViewModel: CommunicationViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communicationViewModel =
            ViewModelProviders.of(requireActivity()).
            get(CommunicationViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first,
            container, false)
    }

    override fun onViewCreated(view: View,
                               savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//Tab Kanan
        //  Nama
        val nameEditTextKanan = view.findViewById<TextInputEditText>(R.id.textInputTextNameKanan)
        nameEditTextKanan.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(
                    charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                }

                override fun onTextChanged(charSequence: CharSequence,
                                           i: Int, i1: Int, i2: Int) {
                    communicationViewModel!!.setNameKanan(charSequence.toString())
                }

                override fun afterTextChanged(editable: Editable) {
                }
            }
        )

    //    NIM
    val nimEditTextKanan = view.findViewById<TextInputEditText>(R.id.textInputTextNIMKanan)
    nimEditTextKanan.addTextChangedListener(
        object : TextWatcher {
            override fun beforeTextChanged(
                charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
            }

            override fun onTextChanged(charSequence: CharSequence,
                                       i: Int, i1: Int, i2: Int) {
                communicationViewModel!!.setNimKanan(charSequence.toString())
            }

            override fun afterTextChanged(editable: Editable) {
            }
        }
    )

//Tab Kiri
        //    NAMA
        val nameEditTextKiri = view.findViewById<TextInputEditText>(R.id.textInputTextNameKiri)
        nameEditTextKiri.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(
                    charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                }

                override fun onTextChanged(charSequence: CharSequence,
                                           i: Int, i1: Int, i2: Int) {
                    communicationViewModel!!.setNameKiri(charSequence.toString())
                }

                override fun afterTextChanged(editable: Editable) {
                }
            }
        )

        //    NIM
        val nimEditTextKiri = view.findViewById<TextInputEditText>(R.id.textInputTextNIMKiri)
        nimEditTextKiri.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(
                    charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                }

                override fun onTextChanged(charSequence: CharSequence,
                                           i: Int, i1: Int, i2: Int) {
                    communicationViewModel!!.setNimKiri(charSequence.toString())
                }

                override fun afterTextChanged(editable: Editable) {
                }
            }
        )
    }



    companion object {
        fun newInstance(): FirstFragment {
            return FirstFragment()
        }
    }
}
