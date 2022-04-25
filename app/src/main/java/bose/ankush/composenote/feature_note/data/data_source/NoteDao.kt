package bose.ankush.composenote.feature_note.data.data_source

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import bose.ankush.composenote.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteDao {

    @Insert
    suspend fun insertNote(note: Note)

    @Query("SELECT * FROM note")
    fun getNote(): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNoteById(id: String): Note?

    @Delete
    suspend fun deleteNote(note: Note)
}