package bose.ankush.composenote.di

import android.app.Application
import androidx.room.Room
import bose.ankush.composenote.feature_note.data.data_source.NoteDatabase
import bose.ankush.composenote.feature_note.data.repository.NoteRepositoryImpl
import bose.ankush.composenote.feature_note.domain.repository.NoteRepository
import bose.ankush.composenote.feature_note.domain.use_case.DeleteNote
import bose.ankush.composenote.feature_note.domain.use_case.GetNotes
import bose.ankush.composenote.feature_note.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(database: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(database.noteDao)
    }

    @Provides
    fun provideUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository)
        )
    }
}