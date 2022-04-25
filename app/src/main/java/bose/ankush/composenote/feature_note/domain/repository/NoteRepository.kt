package bose.ankush.composenote.feature_note.domain.repository

import bose.ankush.composenote.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    suspend fun insertNote(note: Note)

    fun getNote(): Flow<List<Note>>

    suspend fun getNoteById(id: String): Note?

    suspend fun deleteNote(note: Note)
}