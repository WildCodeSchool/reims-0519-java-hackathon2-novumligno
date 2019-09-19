package fr.novumligno.novumligno.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import fr.novumligno.novumligno.entities.Collaborator;
import fr.novumligno.novumligno.repositories.CollaboratorRepository;;

@Component
public class CollaboratorOutputter implements CommandLineRunner {

    @Autowired
    private CollaboratorRepository collaboratorRepository;

    @Override
    public void run(String... args) throws Exception {


        collaboratorRepository.deleteAll();


        String[][] data = new String[][]{
            {
                "Vincent Bochu",
                "Directeur",
                "Agronomie",
                "Management",
                "https://www.linkedin.com/in/vincent-bochu-734501a2/",
                "https://media.licdn.com/dms/image/C4E03AQEEfHmGIpb_eg/profile-displayphoto-shrink_800_800/0?e=1574294400&v=beta&t=7Iv8BZhaGSMKscsHjCI-ZTsq_DuM-RpT_vy5Z3lqtxo"
            },
            {
                "Rémi Van Haesebroucke",
                "Responsable Marché & Agriculture",
                "Agronomie",
                "Economie",
                "https://www.linkedin.com/in/r%C3%A9mi-vanhaesebroucke-724190a4/?originalSubdomain=fr",
                "https://media.licdn.com/dms/image/C4E03AQHqb9EkU6g1pQ/profile-displayphoto-shrink_200_200/0?e=1574294400&v=beta&t=rI1Mf75yCxhoRSlT1BIUucq-NsMD0mwPH6MpOJtT2SU",

            },
            {
                "Benoit Brunsart",
                "Chef du service Innovation-Recherche-Développement",
                "Agronomie",
                "Innovation",
                "https://www.linkedin.com/in/benoit-brunsart-082634162/",
                "https://media.licdn.com/dms/image/C4D03AQHwR_KMH0ocJA/profile-displayphoto-shrink_200_200/0?e=1574294400&v=beta&t=2JzngpPvF9rD9qeuHl3p-GhudTPCZiGCemSCmgGck_0"
            },
            {
                "Hugues Mornand",
                "Responsable Marketing Soufflet Agriculture",
                "Marketing",
                "Management",
                "https://www.linkedin.com/in/hugues-mornand-6926a942/",
                "https://media.licdn.com/dms/image/C5603AQEVdICbxDGeww/profile-displayphoto-shrink_200_200/0?e=1574294400&v=beta&t=--0PUtFNVPzqRR1VYQ-XLiH6pfAbZ-c1Bg1Rh5DBSr0"
            },
            {
                "Savine Oustrain",
                "Directeur Recherche & Innovation Agriculture",
                "Agronomie",
                "Innovation",
                "https://www.linkedin.com/in/savine-oustrain-009842a0/",
                "https://www.vivescia.com/sites/default/files/styles/314x308_masked/public/media/img-savine-oustrain.jpg?itok=-SFgdcD2"
            },

            {
                "Frédéric Adam",
                "Responsable Service Agronomique",
                "Agronomie",
                "Innovation",
                "",
                "https://frederic-magnetiseur.fr/wp-content/uploads/2016/03/Frederic_Adam_Magnetiseur_Sophrologue_Caen_Portrait.jpg"
            },

            {
                "William Huet",
                "Responsable Service Agronomique",
                "Agronomie",
                "",
                "",
                ""
            },

            {
                "Jean-Baptiste Vervy",
                "CEO Ter'Informatique & Directeur de la stratégie digitale Groupe FDSEA51 ",
                "Numérique",
                "",
                "",
                ""
            },

            {
                "Jean-Marie Lett",
                "Responsable du service Conseil",
                "Economie",
                "",
                "",
                ""
            },

            {
                "Carole Leverrier",
                "Responsable Innovation Bioressources",
                "Innovation",
                "",
                "",
                ""
            },

            {
                "Emmanuel Foissy",
                "Responsable Marketing",
                "Marketing",
                "",
                "",
                ""
            },
            {
                "Mélanie Franche",
                "Ingénieur Régional Champagne-Ardenne",
                "Agronomie",
                "",
                "",
                ""
            },
            {
                "Laure Metzger",
                "Directrice",
                "Pédologie",
                "",
                "",
                ""
            },
            {
                "Sébastien Debuisson",
                "Chef du service Vigne",
                "Agronomie",
                "",
                "",
                ""
            },
            {
                "Sébastien Pinet",
                "Directeur",
                "Numérique",
                "",
                "",
                ""
            },
            {
                "Alexandre Laflotte",
                "Directeur Domaine expérimental de la Bouzule",
                "Agronomie",
                "",
                "",
                ""
            },
            {
                "Alexandre Ducruet",
                "Directeur territorial",
                "Valorisation",
                "",
                "",
                ""
            },
            {
                "Olivier Descroizette",
                "Directeur technique Innovation chez bioline by InVivo",
                "Innovation",
                "",
                "",
                ""
            },
            {
                "Eric Perrin",
                "Maître de Conférences & Co-animateur de l'axe 'smart agriculture's",
                "Numérique",
                "",
                "",
                ""
            },
            {
                "Arnaud Gilotin",
                "Président & Pilote-Instructeur-Concepteur",
                "Machinisme",
                "",
                "",
                ""
            },
            {
                "Mathias Sexe",
                "Directeur Agronomie et Développement",
                "Agronomie",
                "",
                "",
                ""
            },
            {
                "Maxime Luneau",
                "Ingénieur Marketing Développement Commercial",
                "Protection des cultures",
                "",
                "",
                ""
            },
            {
                "Renaud Font",
                "Responsable Commercial",
                "Numérique",
                "",
                "",
                ""
            },

        };

        for(String[] collaboratorData : data) {
            Collaborator collaborator = new Collaborator(collaboratorData[0], collaboratorData[1], collaboratorData[2], collaboratorData[3], collaboratorData[4], collaboratorData[5]);
            collaboratorRepository.save(collaborator);
        }
    }    
}