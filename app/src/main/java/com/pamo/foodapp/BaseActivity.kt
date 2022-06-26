package com.pamo.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

/**
 * Base activity class
 */
open class BaseActivity : AppCompatActivity(),CoroutineScope {
    private lateinit var job: Job
    override val coroutineContext:CoroutineContext
    //Dispatcher ensures that debugging in newCoroutineContext function work properly
    get() = job +Dispatchers.Main


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        job = Job()
    }

    override fun onDestroy() {
        super.onDestroy()
        job.cancel()
    }

}