package kr.ac.kumoh.s20200607.w0601precardviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class CardViewModel: ViewModel() {
    private val _cards = MutableLiveData<IntArray>()
    val cards: LiveData<IntArray>
        get() = _cards

    val random = Random(System.currentTimeMillis())

    fun deal() {
        val c = IntArray(5)
        for (i in c.indices) {
            c[i] = random.nextInt(52)
        }
        _cards.value = c
    }
}