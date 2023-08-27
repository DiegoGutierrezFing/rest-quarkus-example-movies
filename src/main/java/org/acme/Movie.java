/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.acme;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

/**
 *
 * @author osboxes
 */
@Schema(name = "Movie", description = "Movie representation")
public class Movie {
    
    private Long id;
    @Schema(required = true)
    private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
