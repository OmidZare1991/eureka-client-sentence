package com.cloud.lab4sentence.demo;

import org.springframework.stereotype.Service;

/**
 * Build a sentence by assembling randomly generated subjects, verbs,
 * articles, adjectives, and nouns.  The individual parts of speech will
 * be obtained by calling the various DAOs.
 */
@Service
public class SentenceServiceImpl implements SentenceService {

    VerbClient verbService;
    SubjectClient subjectService;

    public SentenceServiceImpl(VerbClient verbService, SubjectClient subjectService) {
        this.verbService = verbService;
        this.subjectService = subjectService;
    }

    /**
     * Assemble a sentence by gathering random words of each part of speech:
     */
    public String buildSentence() {
        String sentence = "There was a problem assembling the sentence!";
        sentence = String.format("%s %s.", subjectService.getWord().getString(), verbService.getWord().getString());
        return sentence;
    }
}