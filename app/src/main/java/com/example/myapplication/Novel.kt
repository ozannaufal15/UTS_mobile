package com.example.myapplication

class Novel(var idImageView:Int,
            var title:String,
            var writer:String,
            var info:Int) {


    companion object{
        fun getListNovel(size:Int): List<Novel>{
            return listOf<Novel>(
                Novel(R.drawable.kokoro, "Kokoro","Natsume Soseki", R.array.novelkokoro),
                Novel(R.drawable.wishyouwerehere,"Wish You Were Here","Jodi Picoult",R.array.novelwishyouhere),
                Novel(R.drawable.ourmissinghearts,"Our Missing Hearts","Celeste Ng",R.array.novelourmissinghearts),
                Novel(R.drawable.otherbirds,"Other Birds","Sarah Addison Allen",R.array.novelotherbirds),
                Novel(R.drawable.madhoney,"Mad Honey","Jodi Picoult",R.array.novelmadhoney),
                Novel(R.drawable.honor,"Honor","Thrity Umrigar",R.array.novelhonor),
                Novel(R.drawable.thistimetomorrow,"This Time Tomorrow","Emma Straub",R.array.novelthistimetomorrow),
                Novel(R.drawable.notesexecution,"Notes on an Execution","Danya Kukafka",R.array.novelnotesexecution),
                Novel(R.drawable.maid,"The Maid","Nita Prose",R.array.novelmaid),
                Novel(R.drawable.parisapartment,"The Paris Apartment","Lucy Foley",R.array.novelparisapartment),
                Novel(R.drawable.flickerinthedark,"A Flicker in the Dark","Stacy Willingham",R.array.novelaflickerinthedark),
                Novel(R.drawable.bookofcoldcases,"The Book of Cold Cases","Simone St. James",R.array.novelbookofcoldcases),
                Novel(R.drawable.itgirl,"The It Girl","Ruth Ware",R.array.novelitgirl),
                Novel(R.drawable.allgoodpeople,"All Good People Here","Ashley Flowers",R.array.novelallgoodpeople),
                Novel(R.drawable.daisydarker,"Daisy Darker","Alice Feeney",R.array.noveldaisydarker),
                Novel(R.drawable.jackal,"Jackal","Erin E. Adams",R.array.noveljackal)
            ).shuffled().take(size)
        }
    }
}