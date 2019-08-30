/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ofsides;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author G4u521
 */
@ManagedBean
public class Slidenya {

    private List<String> pic;

    public Slidenya() {
        pic = new ArrayList<String>();
        for (int i = 1; i <= 14; i++) {
            pic.add("koleksi" + i + ".jpg");
        }
    }

    public List<String> getPic() {
        return pic;
    }

}
