package com.marina.criminalintent.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.marina.criminalintent.Crime
import java.util.*

@Dao
interface CrimeDao {

    /*
    * если возвращаемый тип лайвдата, функции выполняются в фоновом потоке
    * */

    @Query("SELECT * FROM crime")
    fun getCrimes(): LiveData<List<Crime>>

    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id: UUID): LiveData<Crime?>
}