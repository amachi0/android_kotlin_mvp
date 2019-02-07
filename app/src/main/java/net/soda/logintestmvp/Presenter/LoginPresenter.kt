package net.soda.logintestmvp.Presenter

import net.soda.logintestmvp.Model.User
import net.soda.logintestmvp.View.ILoginView

class LoginPresenter(loginView: ILoginView): ILoginPresenter{

    val mloginView: ILoginView = loginView

    override fun Login(email: String, password: String) {
        val user: User = User(email, password)
        val isValid: Boolean = user.isValidData()
        if (isValid == true){
            mloginView.onLoginResult("Success")
        } else{
            mloginView.onLoginResult("False")
        }
    }
}