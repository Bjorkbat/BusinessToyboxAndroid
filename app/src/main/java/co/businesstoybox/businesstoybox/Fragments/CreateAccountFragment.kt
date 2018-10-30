package co.businesstoybox.businesstoybox.Fragments

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import co.businesstoybox.businesstoybox.AuthActivity
import co.businesstoybox.businesstoybox.R

class CreateAccountFragment : Fragment() {

    lateinit var mLogin : Button
    lateinit var mCreateAccount : Button

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        val rootView = inflater!!.inflate(R.layout.fragment_create_account, container, false)

        mLogin = rootView.findViewById(R.id.button_login)
        mLogin.setOnClickListener {
            (activity as AuthActivity).switchToLogin()
        }
        return rootView

    }

}