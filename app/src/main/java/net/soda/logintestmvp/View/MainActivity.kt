package net.soda.logintestmvp.View

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import net.soda.logintestmvp.Presenter.LoginPresenter
import net.soda.logintestmvp.R

class MainActivity : AppCompatActivity(), ILoginView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            val email: String = editEmail.text.toString()
            val password: String = editPassword.text.toString()
            val loginPresenter: LoginPresenter = LoginPresenter(this)
            loginPresenter.Login(email, password)
        }

    }

    override fun onLoginResult(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}
