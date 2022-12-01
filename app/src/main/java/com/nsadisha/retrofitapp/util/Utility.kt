package com.nsadisha.retrofitapp.util

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.util.Log
import kotlin.system.exitProcess


class Utility {
    companion object{
        fun p(item: Any){
            Log.d("db", item.toString())
        }

        fun showErrorAlert(context: Context, string: String){
            val dialog: AlertDialog.Builder = android.app.AlertDialog.Builder(context)
            dialog.setCancelable(false)
            dialog.setTitle("Error")
            dialog.setMessage(string)
            dialog.setPositiveButton("Close", DialogInterface.OnClickListener { _, _ ->
                exitProcess(-1)
            })

            val alert: AlertDialog = dialog.create()
            alert.show()
        }
    }
}