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
                "Innovation",
                "https://www.linkedin.com/in/huet-william-31051286/",
                "https://media.licdn.com/dms/image/C4E03AQFEiOABhkGpFQ/profile-displayphoto-shrink_200_200/0?e=1574294400&v=beta&t=UCVVdLM_GUgMllWLXz39O0bAz-HRujUXfZJugr5-XzA"
            },

            {
                "Jean-Baptiste Vervy",
                "CEO Ter'Informatique & Directeur de la stratégie digitale Groupe FDSEA51 ",
                "Numérique",
                "Management",
                "https://www.linkedin.com/in/jean-baptiste-vervy-a2202999/",
                "https://media.licdn.com/dms/image/C4E03AQEmcRrQYQK58A/profile-displayphoto-shrink_200_200/0?e=1574294400&v=beta&t=eKyE94m0P2c8_fZamGkqzq3zBbMQiaqypdVlIgruHLI"
            },

            {
                "Jean-Marie Lett",
                "Responsable du service Conseil",
                "Economie",
                "Machinisme",
                "",
                "https://www.iasquebec.com/wp-content/themes/ATYPIC/public/img/profile-default-male.png"
            },

            {
                "Carole Leverrier",
                "Responsable Innovation Bioressources",
                "Innovation",
                "Valorisation",
                "https://www.linkedin.com/in/carole-leverrier-bb69b7111/",
                "https://us.123rf.com/450wm/kritchanut/kritchanut1406/kritchanut140600106/29213216-stock-vector-female-avatar-silhouette-profile-pictures.jpg?ver=6",
            },

            {
                "Emmanuel Foissy",
                "Responsable Marketing",
                "Marketing",
                "Economie",
                "",
                "https://www.iasquebec.com/wp-content/themes/ATYPIC/public/img/profile-default-male.png"
            },
            {
                "Mélanie Franche",
                "Ingénieur Régional Champagne-Ardenne",
                "Agronomie",
                "Biologie",
                "",
                "https://us.123rf.com/450wm/kritchanut/kritchanut1406/kritchanut140600106/29213216-stock-vector-female-avatar-silhouette-profile-pictures.jpg?ver=6"
            },
            {
                "Laure Metzger",
                "Directrice",
                "Pédologie",
                "Biologie",
                "https://www.linkedin.com/in/laure-metzger-0861504/",
                "https://us.123rf.com/450wm/kritchanut/kritchanut1406/kritchanut140600106/29213216-stock-vector-female-avatar-silhouette-profile-pictures.jpg?ver=6",
            },
            {
                "Sébastien Debuisson",
                "Chef du service Vigne",
                "Agronomie",
                "Management",
                "",
                "https://www.iasquebec.com/wp-content/themes/ATYPIC/public/img/profile-default-male.png"
            },
            {
                "Sébastien Pinet",
                "Directeur",
                "Numérique",
                "Zootechnie",
                "https://www.linkedin.com/in/sebastien-pinet-724456158/",
                "https://www.iasquebec.com/wp-content/themes/ATYPIC/public/img/profile-default-male.png",
            },
            {
                "Alexandre Laflotte",
                "Directeur Domaine expérimental de la Bouzule",
                "Agronomie",
                "Zootechnie",
                "",
                "https://www.iasquebec.com/wp-content/themes/ATYPIC/public/img/profile-default-male.png"
                
            },
            {
                "Alexandre Ducruet",
                "Directeur territorial",
                "Valorisation",
                "Management",
                "https://www.linkedin.com/in/ducruet-alexandre-1298b08/",
                "https://media.licdn.com/dms/image/C4E03AQFqb4DJaFzunw/profile-displayphoto-shrink_200_200/0?e=1574294400&v=beta&t=Jv7gkHA2qhrpiFtlZcdWdLpfEsgZQ5T_qGiWs6JfLFA"
            },
            {
                "Olivier Descroizette",
                "Directeur technique Innovation chez bioline by InVivo",
                "Innovation",
                "Numérique",
                "https://www.linkedin.com/in/olivier-descroizette-399821a1/",
                "https://media.licdn.com/dms/image/C4D03AQFwlOK78LhQRA/profile-displayphoto-shrink_200_200/0?e=1574294400&v=beta&t=No5B-OW0wMe5ldKireajgp373hSPGJO3a5U8Vloh3Cw",
            },
            {
                "Eric Perrin",
                "Maître de Conférences & Co-animateur de l'axe 'smart agriculture's",
                "Numérique",
                "Innovation",
                "https://www.researchgate.net/profile/E_Perrin",
                "https://www.iasquebec.com/wp-content/themes/ATYPIC/public/img/profile-default-male.png"
            },
            {
                "Arnaud Gilotin",
                "Président & Pilote-Instructeur-Concepteur",
                "Machinisme",
                "Numérique",
                "https://www.linkedin.com/in/arnaud-gilotin-05827b156/",
                "https://media.licdn.com/dms/image/C4D03AQF8UGmP_-iAZA/profile-displayphoto-shrink_200_200/0?e=1574294400&v=beta&t=7QDP5BQau4LOuGeozBHSlh0oQ5w6Uqfjw0ozjxiiOYc"
            },
            {
                "Mathias Sexe",
                "Directeur Agronomie et Développement",
                "Agronomie",
                "Innovation",
                "https://www.linkedin.com/in/mathias-sexe-81317978/?originalSubdomain=fr",
                "https://media.licdn.com/dms/image/C4E03AQEDOMgw6aEZLg/profile-displayphoto-shrink_200_200/0?e=1574294400&v=beta&t=2MAOqIR8fuyhZbIRXbANEcZbuWxto1k6saQqJIW1lCU"
            },
            {
                "Maxime Luneau",
                "Ingénieur Marketing Développement Commercial",
                "Protection des cultures",
                "Marketing",
                "http://fr.viadeo.com/fr/profile/maxime.luneau4",
                "http://static8.viadeo-static.com/QBhAivkS4EtBCC7SXIl9Y-boXCw=/300x300/member/0021djgjq6szzvm5%3Fts%3D1386671078000"
            },
            {
                "Renaud Font",
                "Responsable Commercial",
                "Numérique",
                "Marketing",
                "https://www.linkedin.com/in/renaud-font/",
                "https://media.licdn.com/dms/image/C5603AQGTM4GoRx_MKg/profile-displayphoto-shrink_200_200/0?e=1574294400&v=beta&t=Tbt1LWma87R86sR09ol7TiuYP85YEAhIogJ8LFhiIW4" 
            },

        };

        for(String[] collaboratorData : data) {
            Collaborator collaborator = new Collaborator(collaboratorData[0], collaboratorData[1], collaboratorData[2], collaboratorData[3], collaboratorData[4], collaboratorData[5]);
            collaboratorRepository.save(collaborator);
        }
    }    
}