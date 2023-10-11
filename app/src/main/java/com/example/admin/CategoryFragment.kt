package com.example.admin

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class CategoryFragment : Fragment() {
    lateinit var button: Button
    lateinit var alertDialog: AlertDialog.Builder

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val itemView: View = inflater.inflate(R.layout.fragment_category, container, false)
        button = itemView.findViewById(R.id.add_category)
        alertDialog = AlertDialog.Builder(requireContext())

        button.setOnClickListener() {


            alertDialog.setTitle("Category name")
                .setMessage("Enter category name...")
                .setCancelable(true)

                .setPositiveButton("save"){
                    dialogInterface, it->
                    // finish()
                }

                .setNegativeButton("Cancel"){
                    dialogInterface, it-> dialogInterface.cancel()
                }
                .show()


        }




        return itemView
    }


}