package co.businesstoybox.businesstoybox

import android.app.Activity
import android.os.Bundle
import co.businesstoybox.businesstoybox.Fragments.LoginFragment

/**
 * Activity that handles the UI and logic for logging a user in.
 */
class AuthActivity : Activity() {

    val mFragment = LoginFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        fragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, mFragment)
            .commit()
    }

}