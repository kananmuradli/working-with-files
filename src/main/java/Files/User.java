/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    public String name;

    public transient String password;

    public int i;
}
