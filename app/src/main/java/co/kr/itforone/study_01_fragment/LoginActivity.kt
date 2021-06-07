package co.kr.itforone.study_01_fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import co.kr.itforone.study_01_fragment.Retrofit.LoginService
import co.kr.itforone.study_01_fragment.Retrofit.RetrofitClient
import co.kr.itforone.study_01_fragment.databinding.ActivityLoginBinding
import retrofit2.Retrofit

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var retrofit : Retrofit
    private lateinit var loginService: LoginService
    private var backPrssedTime: Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView<ActivityLoginBinding>(this,R.layout.activity_login)
        binding.logindata = this

        retrofit = RetrofitClient.getInstance()
        loginService = retrofit.create(LoginService::class.java)



    }
    fun login_submit(view :View){

        var inputid : String? =  binding.inputId.text.toString()
        var inputpwd : String? =  binding.inputPwd.text.toString()

        Log.d("inputinfo_id", inputid.toString())
        Log.d("inputinfo_pwd", inputpwd.toString())

       /* if(inputid!=null && inputpwd!=null)
            loginService.signup(inputid,inputpwd).enqueue(object : Callback<Array<DataSignin>>{



            })

*/

        var i : Intent = Intent(this,MainActivity::class.java)
        startActivity(i)

    }

    override fun onBackPressed() {
        val tempTime = System.currentTimeMillis()
        val intervalTime: Long = tempTime - backPrssedTime

        if (0 <= intervalTime && 2000 >= intervalTime) {
            finish()
        } else {
            backPrssedTime = tempTime
            Toast.makeText(applicationContext, "한번 더 뒤로가기 누를시 앱이 종료됩니다.", Toast.LENGTH_SHORT).show()
        }


    }
}


