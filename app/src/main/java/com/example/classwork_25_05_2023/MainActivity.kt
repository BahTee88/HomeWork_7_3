package com.example.classwork_25_05_2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.classwork_25_05_2023.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    var arrayList:ArrayList<Truck> = ArrayList()
    var arrayList2:ArrayList<Truck> = ArrayList()


    lateinit var adapter: TrucksAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        arrayList.add(Truck("Freightliner","Cascadia","One of the Best Trucks in USA","White",161000,"https://api.time.com/wp-content/uploads/2015/05/self-driving-freightliner-truck.jpg"))
        arrayList.add(Truck("Volvo","VNL 860","One of the best second  Trucks in USA","Red",150000,"https://orion.soarr.com/photos/16205088/800x/2020-volvo-vnl+860.1.jpg"))
        arrayList.add(Truck("Kenworth ","T680","One of the Best third  Trucks in USA","Dark Gray",120000,"https://orion.soarr.com/photos/16120366/800x/2022-kenworth-t680.1.jpg"))
        arrayList.add(Truck("Peterbilt","579 Ultraloft","One of the Best forth Trucks in USA","Blue",115000,"https://truckmarket.com/wp-content/uploads/trucks/114977/2023-peterbilt-567-sleeper-830704-2.jpg"))
        arrayList.add(Truck("International","interstate","One of the Best fifth Trucks in USA","White",110000,"https://photosthumb.dealerimagepro.com/lib/navistar/05.02.2023/USED/%28International%20-%20ProStar%2B%293HSDJAPR2HN483980/3HSDJAPR2HN483980--01.jpg?ver=1683724182"))

        arrayList2.add(Truck("Freightliner","Cascadia","One of the Best Trucks in USA","White",161000,"https://api.time.com/wp-content/uploads/2015/05/self-driving-freightliner-truck.jpg"))
        arrayList2.add(Truck("Volvo","VNL 860","One of the best second  Trucks in USA","Red",150000,"https://orion.soarr.com/photos/16205088/800x/2020-volvo-vnl+860.1.jpg"))
        arrayList2.add(Truck("Kenworth ","T680","One of the Best third  Trucks in USA","Dark Gray",120000,"https://orion.soarr.com/photos/16120366/800x/2022-kenworth-t680.1.jpg"))
        arrayList2.add(Truck("Peterbilt","579 Ultraloft","One of the Best forth Trucks in USA","Blue",115000,"https://truckmarket.com/wp-content/uploads/trucks/114977/2023-peterbilt-567-sleeper-830704-2.jpg"))
        arrayList2.add(Truck("International","interstate","One of the Best fifth Trucks in USA","White",110000,"https://photosthumb.dealerimagepro.com/lib/navistar/05.02.2023/USED/%28International%20-%20ProStar%2B%293HSDJAPR2HN483980/3HSDJAPR2HN483980--01.jpg?ver=1683724182"))
        adapter = TrucksAdapter(arrayList){

        }
        binding.recyclerView.adapter = adapter
        binding.recyclerViewTwo.adapter = adapter
    }
}