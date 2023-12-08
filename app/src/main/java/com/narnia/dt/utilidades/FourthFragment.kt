package com.narnia.dt.utilidades

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton


class FourthFragment : Fragment() {

    private  var countries : List<Country> = emptyList()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fourth, container, false)

        val fab = view.findViewById<FloatingActionButton>(R.id.fab_new)

        fab.setOnClickListener{
            val bottomSheetDialog = BottomSheetDialog(view.context)
            val parentView: View = layoutInflater.inflate(R.layout.bsd_new_country , null)
            bottomSheetDialog.setContentView(parentView)
            bottomSheetDialog.show()
        }

        initData()
        var recyclerView = view.findViewById<RecyclerView>(R.id.countriesRecycler)
        //Lista Anchura Completa
        val  layoutManager = LinearLayoutManager(container?.context)
        //cuadricula 2x2
        //val gridLayoutManager = GridLayoutManager(container?.context,)

        val adapter = CountryAdapter(countries)
        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
        return view
    }
    public fun initData(){
        countries = listOf(
            Country(1,"Espaguetti",
                "Italia",
                "https://upload.wikimedia.org/wikipedia/commons/3/3c/Flag_of_Italy_%28Pantone%29.svg",
                "https://myplate-prod.azureedge.us/sites/default/files/styles/recipe_525_x_350_/public/2021-09/OnePanSpaghetti_527x323.jpg?itok=9lREbBeb",
                "$75.00"),
        Country(2,"Tacos",
            "Mexico",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Flag_of_Mexico.svg/980px-Flag_of_Mexico.svg.png",
            "https://www.comedera.com/wp-content/uploads/2017/08/tacos-al-pastor-receta.jpg",
            "$100.00"),
        Country(3,"Donas",
                "USA",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1f/Flag_of_the_United_States_%281776%E2%80%931777%29.svg/200px-Flag_of_the_United_States_%281776%E2%80%931777%29.svg.png",
                "https://mandolina.co/wp-content/uploads/2023/05/mini-Donas-rellenas-en-Air-Fryer-1200x900.jpg",
                "$25.00"),
        Country(4,"Churros",
                "Mexico",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Flag_of_Mexico.svg/980px-Flag_of_Mexico.svg.png",
                "https://scm-assets.constant.co/scm/unilever/08150666ebe0c77d3adf5b40f4ab5116/73df63e4-625b-4566-97f2-501102d11fe5.jpg",
                "$50.00"),
        Country(5,"Tortilla",
                "Espana",
                "https://img.asmedia.epimg.net/resizer/Mhe8d93W40EP8OxQ5po5-Pb4-vU=/1472x1104/cloudfront-eu-central-1.images.arcpublishing.com/diarioas/53YSJXSIZFHNTBV52Z4AMKISUM.png",
                "https://assets.tmecosys.com/image/upload/t_web767x639/img/recipe/ras/Assets/b739f2a3-446a-4f2d-ab99-bdf4862c403f/Derivates/405856fc-66fc-43ff-a281-eb10c33a2d58.jpg",
                "$75.00"),
        Country(6,"Ramen",
                "Japon",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Flag_of_Japan.svg/200px-Flag_of_Japan.svg.png",
                "https://www.elespectador.com/resizer/no4rcBp4Cb3h48dGGsVfdtQozRA=/arc-anglerfish-arc2-prod-elespectador/public/JSLO252ENNHSDIN5WGK6IM43HI.jpg",
                "$120.00"),
        Country(7,"Gyozas",
                "Japon",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Flag_of_Japan.svg/200px-Flag_of_Japan.svg.png",
                "https://www.justonecookbook.com/wp-content/uploads/2020/04/Gyoza-3112-I.jpg",
                "$75.00"),
        Country(8,"Arepas",
                "Venezuela",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/06/Flag_of_Venezuela.svg/200px-Flag_of_Venezuela.svg.png",
                "https://imag.bonviveur.com/arepas-venezolanas-caseras-rellenas.jpg",
                "$30.00"),
        Country(9,"Horchata",
                "Mexico",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Flag_of_Mexico.svg/980px-Flag_of_Mexico.svg.png",
                "https://cdn0.recetasgratis.net/es/posts/5/7/3/agua_de_horchata_74375_orig.jpg",
                "$25.00"),
        Country(10,"Mate",
                "Argentina",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/200px-Flag_of_Argentina.svg.png",
                "https://www.gustoargentino.com/cdn/shop/articles/yerba-mate-gusto-argentino.png?v=1621357637",
                "$30.00"),
        )
    }
}