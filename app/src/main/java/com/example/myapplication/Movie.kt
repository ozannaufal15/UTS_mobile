package com.example.myapplication

class Movie(var idImageView:Int,
            var title:String,
            var year:String,
            var info:Int) {

    companion object{
        fun getListNovel(size:Int): List<Movie>{
            return listOf<Movie>(
                Movie(R.drawable.bladerunner2049,"Blade Runner 2049","2017",R.array.moviebladerunner2049),
                Movie(R.drawable.starwars8,"Star Wars: The Last Jedi","2017",R.array.moviestarwars8),
                Movie(R.drawable.thetheoryofeverything,"The Theory of Everything","2014",R.array.movietheoryofeverything),
                Movie(R.drawable.coco,"Coco","2017",R.array.moviecoco),
                Movie(R.drawable.hitmansbodyguard,"The Hitman\'s Bodyguard","2017",R.array.moviehitmansbodyguard),
                Movie(R.drawable.kongskullisland,"Kong: Skull Island","2017",R.array.moviekongskullisland),
                Movie(R.drawable.darktower,"The Dark Tower","2017",R.array.moviedarktower),
                Movie(R.drawable.babydriver,"Baby Driver","2017",R.array.moviebabydriver),
                Movie(R.drawable.post,"The Post","2017",R.array.moviepost),
                Movie(R.drawable.goodtime,"Good Time","2017",R.array.moviegoodtime),
                Movie(R.drawable.shapeofwater,"The Shape of Water","2017",R.array.movieshapeofwater),
                Movie(R.drawable.aliencovenant,"Alien: Covenant","2017",R.array.moviealiencovenant),
                Movie(R.drawable.split,"Split","2017",R.array.moviesplit),
                Movie(R.drawable.sixthsense,"The Sixth Sense","1999",R.array.moviesixthsense),
                Movie(R.drawable.everythingeverywhereallatonce,"Everything Everywhere All at Once","2022",R.array.movieeverythingeverywhereallatonce),
                Movie(R.drawable.amancalledotto,"A Man Called Otto","2022",R.array.movieamancalledotto)
            ).shuffled().take(size)
        }
    }
}