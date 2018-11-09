package net.synapsehub.kotlin_codelabs1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import net.synapsehub.kotlin_codelabs1.helper.HelperDb
import net.synapsehub.kotlin_codelabs1.model.Humain


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val context=this

        btn_signup.setOnClickListener({
            //faire un test si les donnees oont ete saisies
            if(input_name.text.toString().length>0 && input_email.text.toString().length>0 && input_password.text.toString().length>0){
                //on cree un variable de type Humain
                var Toto=Humain(input_name.text.toString(),input_email.text.toString(),input_password.text.toString());
                //on cree une variable du type Helper pour sqlite
                var db=HelperDb(context)
                //on fait appel a la methode d'insertion
                db.insererDonnees(Toto)
            }else{
                Toast.makeText(context,"donnees vides", Toast.LENGTH_LONG).show()
            }
        })

    }
}
