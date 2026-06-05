package com.example.jonda;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface JourneyDao {
    @Insert
    void insert(Journey journey);

    @Query("SELECT * FROM journeys ORDER BY timestamp DESC")
    List<Journey> getAllJourneys();
}
