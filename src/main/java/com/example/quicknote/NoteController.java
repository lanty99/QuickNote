package com.example.quicknote;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;

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




}
