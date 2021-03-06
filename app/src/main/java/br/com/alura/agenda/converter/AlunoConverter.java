package br.com.alura.agenda.converter;

import org.json.JSONException;
import org.json.JSONStringer;

import java.util.List;

import br.com.alura.agenda.modelo.Aluno;

public class AlunoConverter {

    public String converterParaJSON(List<Aluno> characters) throws JSONException {

        try {
            JSONStringer js = new JSONStringer();
            js.object().key("list").array().object().key("character").array();

            for (Aluno character: characters){
                js.object();
                js.key("nome").value(character.getNome());
                js.key("power").value(character.getPower());
                js.endObject();
            }
            return js.endArray().endObject().endArray().endObject().toString();

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return "";
    }
}
