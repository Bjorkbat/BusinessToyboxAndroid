package co.businesstoybox.businesstoybox.Fragments

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import co.businesstoybox.businesstoybox.AuthActivity
import co.businesstoybox.businesstoybox.MainActivity
import co.businesstoybox.businesstoybox.R

class LoginFragment : Fragment() {

    lateinit var mUsername : EditText
    lateinit var mPassword : EditText
    lateinit var mCreateAccount : Button
    lateinit var mLogin : Button
    lateinit var mForgotPassword : Button

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        val rootView = inflater!!.inflate(R.layout.fragment_login, container, false)

        mUsername = rootView.findViewById(R.id.login_username)
        mPassword = rootView.findViewById(R.id.login_password)

        mCreateAccount = rootView.findViewById(R.id.button_create_account)
        mLogin = rootView.findViewById(R.id.button_login)
        mForgotPassword = rootView.findViewById(R.id.button_forgot_password)

        mCreateAccount.setOnClickListener {
            (activity as AuthActivity).switchToCreate()
        }

        mLogin.setOnClickListener {

            // Fire off login request

        }

        return rootView
    }
}