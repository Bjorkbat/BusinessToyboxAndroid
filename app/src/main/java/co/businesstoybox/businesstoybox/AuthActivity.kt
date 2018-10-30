package co.businesstoybox.businesstoybox

import android.app.Activity
import android.app.Fragment
import android.os.Bundle
import co.businesstoybox.businesstoybox.Fragments.CreateAccountFragment
import co.businesstoybox.businesstoybox.Fragments.LoginFragment

/**
 * Activity that handles the UI and logic for logging a user in.
 */
class AuthActivity : Activity() {

    var mFragment : Fragment = LoginFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        fragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, mFragment)
            .commit()
    }

    fun switchToCreate() {

        mFragment = CreateAccountFragment()

        fragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, mFragment)
            .commit()

    }

    fun switchToLogin() {

        mFragment = LoginFragment()

        fragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, mFragment)
            .commit()

    }

}