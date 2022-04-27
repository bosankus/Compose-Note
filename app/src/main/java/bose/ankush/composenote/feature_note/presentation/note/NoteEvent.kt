package bose.ankush.composenote.feature_note.presentation.note

import bose.ankush.composenote.feature_note.domain.model.Note
import bose.ankush.composenote.feature_note.domain.util.NoteOrder

sealed class NoteEvent {
    data class Order(val noteOrder: NoteOrder): NoteEvent()
    data class DeleteNote(val note: Note): NoteEvent()
    object RestoreNote: NoteEvent()
    object ToggleOrderSection: NoteEvent()
}