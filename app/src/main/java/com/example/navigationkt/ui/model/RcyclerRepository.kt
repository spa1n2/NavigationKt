package com.example.navigationkt.ui.model

class RcyclerRepository {
    private val recyclerModelData = arrayListOf<RecyclerModel>()
    fun getListRcyclerData(): ArrayList<RecyclerModel>{
        recyclerModelData.add(RecyclerModel(
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6-CfBQfPOy3css9v1Km-ydKyfgMNUcKp73A&usqp=CAU",
            "JOrdan1",
            "$33",
            "#FF1100"
        ))
        recyclerModelData.add(RecyclerModel(
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQEux54iey5kE9foSbyIXHlRV5G91_mbd8DRA&usqp=CAU",
            "JOrdan2",
            "$44",
            "#2196F3"
        ))
        recyclerModelData.add(RecyclerModel(
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQumblYCK3hDq8zB2b8q56mqZ7HBQrdxPo8GQ&usqp=CAU",
            "Jordan3",
            "$55",
            "#FFC107"
        ))
        recyclerModelData.add(RecyclerModel(
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR7ZxOKQsApVD_dEPMIuDBfmT9P8fC4M_t9fQ&usqp=CAU",
            "JOrdan4",
            "$66",
            "#613BA5"
        ))
        recyclerModelData.add(RecyclerModel(
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRQ0tIJ95oUM6Ar95uPFVTDVv8vjDMzIAnzag&usqp=CAU",
            "Jordan5",
            "$67",
            "#BCC379"
        ))
        recyclerModelData.add(RecyclerModel(
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT1V1kSXVfCdWepFQG8fU6Gf71qAk1oq03sMg&usqp=CAU",
            "Jordan6",
            "$77",
            "#28752B"
        ))
        recyclerModelData.add(RecyclerModel(
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6Oojk48DJMBnOefGuva_Jc1kVBkqkWIZFOQ&usqp=CAU",
            "Jordan7",
            "$89",
            "#575757"
        ))
        return recyclerModelData
    }
}