package bose.ankush.composenote.feature_note.data.repository

import bose.ankush.composenote.feature_note.data.data_source.NoteDao
import bose.ankush.composenote.feature_note.domain.model.Note
import bose.ankush.composenote.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(private val noteDao: NoteDao) : NoteRepository {

    override suspend fun insertNote(note: Note) {
        noteDao.insertNote(note)
    }

    override fun getNote(): Flow<List<Note>> {
        return noteDao.getNote()
    }

    override suspend fun getNoteById(id: String): Note? {
        return noteDao.getNoteById(id)
    }

    override suspend fun deleteNote(note: Note) {
        noteDao.deleteNote(note)
    }
}