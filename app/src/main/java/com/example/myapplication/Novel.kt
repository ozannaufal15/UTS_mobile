package com.example.myapplication

class Novel(var id:String,
            var idImageView:Int,
            var title:String,
            var writer:String,
            var synopsis:String) {


    companion object{
        fun getListNovel(size:Int): List<Novel>{
            return listOf<Novel>(
                Novel("0", R.drawable.logo_unlam,"Kokoro","Natsume Soseki",""),
                Novel("1", R.drawable.logo_unlam,"2","a",""),
                Novel("3", R.drawable.logo_unlam,"3","b",""),
                Novel("4", R.drawable.logo_unlam,"4","c",""),
                Novel("5", R.drawable.logo_unlam,"5","d",""),
                Novel("6", R.drawable.logo_unlam,"6","e",""),
                Novel("7", R.drawable.logo_unlam,"7","f",""),
                Novel("8", R.drawable.logo_unlam,"8","g","")
            )
        }
    }
}