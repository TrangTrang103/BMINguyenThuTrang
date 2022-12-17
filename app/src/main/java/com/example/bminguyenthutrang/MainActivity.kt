package com.example.bminguyenthutrang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtCanNang = findViewById<EditText>(R.id.edtCanNang)
        val edtChieuCao = findViewById<EditText>(R.id.edtChieuCao)
        val btnTinhBMI = findViewById<Button>(R.id.btnTinhBMI)
        val txtChiSo = findViewById<TextView>(R.id.txtChiSo)
        val txtDanhGia = findViewById<TextView>(R.id.txtDanhGia)



        btnTinhBMI.setOnClickListener{
            var cannang = edtCanNang.text.toString().toFloat()
            var chieucao = edtChieuCao.text.toString().toFloat()


            val bmi = cannang/(chieucao*chieucao)
            txtChiSo.setText(bmi.toString())
            if (bmi < 18)
                txtDanhGia.setText("Hơi Gầy: <18");
            else if (18 <= bmi && bmi < 25)
                txtDanhGia.setText("Bạn bình thường: 18.5 - 24.99");
            else if (25 <= bmi && bmi < 35)
                txtDanhGia.setText("Bạn Hơi nặng: 25 - 34,99");
            else if (35 <= bmi)
                txtDanhGia.setText("Bạn béo phì > 35");
    }
}
}