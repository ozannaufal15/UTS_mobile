package com.example.myapplication

class Movie(var idImageView:Int,
            var title:String,
            var year:String,
            var synopsis:String) {

    companion object{
        fun getListNovel(size:Int): List<Movie>{
            return listOf<Movie>(
                Movie(R.drawable.logo_unlam,"Kokoro","Natsume Soseki",""),
                Movie(R.drawable.logo_unlam,"2","a",""),
                Movie(R.drawable.logo_unlam,"3","b",""),
                Movie(R.drawable.logo_unlam,"4","c",""),
                Movie(R.drawable.logo_unlam,"5","d",""),
                Movie(R.drawable.logo_unlam,"6","e",""),
                Movie(R.drawable.logo_unlam,"7","f",""),
                Movie(R.drawable.logo_unlam,"8","g","")
            )
        }
    }
}