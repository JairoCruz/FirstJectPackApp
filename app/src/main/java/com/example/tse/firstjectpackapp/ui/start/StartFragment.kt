package com.example.tse.firstjectpackapp.ui.start

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import com.example.tse.firstjectpackapp.R

class StartFragment : Fragment() {

    companion object {
        fun newInstance() = StartFragment()
    }

    private lateinit var viewModel: StartViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.start_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(StartViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        TODO 6: Agregando un ClickListener para utilizar la accion defenida en el archivo de navigation
//        En el fragmento principal agrego un boton al cual le asigno un clickListener para hacer el llamado
//        atraves del id de la accion
        view.findViewById<Button>(R.id.btn_next)?.setOnClickListener {
            findNavController(it).navigate(R.id.action_to_nextFragment)
        }
    }

}
