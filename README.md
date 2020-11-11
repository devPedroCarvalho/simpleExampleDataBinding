# DATA BINDING 

### DEFINIÇÃO: 

A Data Binding Library é uma biblioteca de apoio que permite vincular componentes de IU dos seus layouts a fontes de dados do app usando um formato declarativo, em vez de programático.


### PRIMEIRO PASSO: 

Adicionar no build.gradle: 


apply plugin: 'kotlin-kapt'

android {
...
    buildFeatures {
       dataBinding true
    }
}


### SEGUNDO PASSO: 

Adicionar a TAG <LAYOUT> no xml. Por exemplo:
```
<layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools">

    <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity">

    </androidx.constraintlayout.widget.ConstraintLayout>
</layout>
```

### ÚLTIMO PASSO:

Implementar o objeto Binding na sua Activity ou fragment. Exemplo na Activity:

```
   class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.button.setOnClickListener {
            behaviorProgressBar()
        }

    }
    
}
```
### DataBinding ou Kotlin Android Extensions 

Com o Kotlin Android Extensions é possível evitar o findViewById() em projetos pequenos. E é muito mais fácil de utilizar e é útil em algumas situações. Mas não é uma prática recomendada pelo Google. Além disso quando o projeto é maior você perde muitas vantagens fornecidas pelo Data Binding. 

### Alguns benefícios do Data Binding:

1) Atualize os valores automaticamente. (Não é necessário controlar todas as maneiras como um valor pode ser atualizado)

2) Código mais legível

3) Código mais sustentável

4) Tempos de desenvolvimento mais rápidos

5) Tempos de execução mais rápidos

6) Adequado para arquiteturas MVVM e MVI.

7) Erros podem ser encontrados durante o tempo de compilação.

### FIMMMMMM! 


