package com.example.quicknote;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/notes")

public class NoteController {

    private final NoteRepository noteRepository;

    public NoteController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @GetMapping
    public List<Note> getNotes() {
        return noteRepository.findAll();

    }
    @PostMapping
    public Note createNote(@RequestBody Note note) {
        note.setCreatedAt(LocalDateTime.now());
        return noteRepository.save(note);

    }
    @PutMapping("/{id}")
    public ResponseEntity<Note> updateNote(@PathVariable Long id, @RequestBody Note updatedNote) {
        Optional<Note> byId = noteRepository.findById(id);
        if (byId.isPresent()) {
            Note existingNote = byId.get();
            updatedNote.setId(id);
            updatedNote.setCreatedAt(existingNote.getCreatedAt());
            ResponseEntity<Note> ok = ResponseEntity.ok(noteRepository.save(updatedNote));
            return ok;
        }
            else{
                return ResponseEntity.notFound().build();
            }

        }

    }
