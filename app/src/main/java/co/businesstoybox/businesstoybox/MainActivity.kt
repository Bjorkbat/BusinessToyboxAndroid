package co.businesstoybox.businesstoybox

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : Activity() {

    lateinit var mSharedPreferences : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Detect for the presence of a JWT. No JWT?  Then direct user to the AuthActivity
        mSharedPreferences = getSharedPreferences(getString(R.string.auth_prefs_key), Context.MODE_PRIVATE)
        val jwt = mSharedPreferences.getString("jwt", "")
        if (jwt == "") {

            // Go to Login
            val intent = Intent(this, AuthActivity::class.java)
            startActivity(intent)

        }
    }

}
