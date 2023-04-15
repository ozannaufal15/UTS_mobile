package com.example.myapplication

class Novel(var idImageView:Int,
            var title:String,
            var writer:String,
            var synopsis:String) {


    companion object{
        fun getListNovel(size:Int): List<Novel>{
            return listOf<Novel>(
                Novel(R.drawable.kokoro, "Kokoro","Natsume Soseki",""),
                Novel(R.drawable.wishyouwerehere,"Wish You Were Here","Jodi Picoult",""),
                Novel(R.drawable.ourmissinghearts,"Our Missing Hearts","Celeste Ng",""),
                Novel(R.drawable.otherbirds,"Other Birds","Sarah Addison Allen",""),
                Novel(R.drawable.madhoney,"Mad Honey","Jodi Picoult",""),
                Novel(R.drawable.honor,"Honor","Thrity Umrigar",""),
                Novel(R.drawable.thistimetomorrow,"This Time Tomorrow","Emma Straub",""),
                Novel(R.drawable.notesexecution,"Notes on an Execution","Danya Kukafka",""),
                Novel(R.drawable.maid,"The Maid","Nita Prose",""),
                Novel(R.drawable.parisapartment,"The Paris Apartment","Lucy Foley",""),
                Novel(R.drawable.flickerinthedark,"A Flicker in the Dark","Stacy Willingham",""),
                Novel(R.drawable.bookofcoldcases,"The Book of Cold Cases","Simone St. James",""),
                Novel(R.drawable.itgirl,"The It Girl","Ruth Ware",""),
                Novel(R.drawable.allgoodpeople,"All Good People Here","Ashley Flowers",""),
                Novel(R.drawable.daisydarker,"Daisy Darker","Alice Feeney",""),
                Novel(R.drawable.jackal,"Jackal","Erin E. Adams","")
            ).shuffled().take(size)
        }
    }
}