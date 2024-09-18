package com.example.splacescreen

import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_2)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },3000)
        //startapp();
    }

//    private fun startapp() {
//     Long().execute()
//    }
//    private class  Long : AsyncTask<String?,Void ?, String?>() {
//        override fun doInBackground(vararg p0: String?): String {
//           for(i in 0..4){
//               try{
//                   Thread.sleep(1000)
//               }
//               catch (e: Exception){
//                   Thread.interrupted()
//               }
//           }
//            return "result"
//        }
//
//        override fun onPostExecute(result: String?) {
//            super.onPostExecute(result)
//            val intent=Intent(this@Long,MainActivity::class.java)
//            Intent()
//            startActivity(intent)
//
//        }
//
//        private fun startActivity(intent: Any) {
//
//        }
//
//        private fun Intent(long: Activity2.Long, java: Class<MainActivity>) {
//            return
//        }
//
//    }
}