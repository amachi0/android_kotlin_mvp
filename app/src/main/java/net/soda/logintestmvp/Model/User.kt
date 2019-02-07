package net.soda.logintestmvp.Model

import android.text.TextUtils
import android.util.Log
import android.util.Patterns

class User(email: String, password: String): IUser {

    var mail: String = email
    var passwords: String = password

    override fun getEmail(): String {
        return mail
    }

    override fun getPassword(): String {
        return passwords
    }

    override fun isValidData(): Boolean {
        Log.d("email", getEmail())
        Log.d("password", getPassword())
        if(!TextUtils.isEmpty(getEmail())){
            Log.d("null", "success")
        }
        if(getPassword().length > 6){
            Log.d("length", "success")
        }
        if(Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()){
            Log.d("match", "success")
        }
        return !TextUtils.isEmpty(getEmail())  && getPassword().length > 6 && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()
    }

}