package fr.novumligno.novumligno.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import fr.novumligno.novumligno.entities.Company;
import fr.novumligno.novumligno.repositories.CompanyRepository;;

@Component
public class Outputter implements CommandLineRunner {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public void run(String... args) throws Exception {


        companyRepository.deleteAll();


        String[][] data = new String[][]{
            {
                "TerraSolis",
                "https://png.pngtree.com/png-clipart/20190515/original/pngtree-coffee-time-png-image_3626459.jpg",
                "Association de promotion de la multifonctionnalité via l'émergence d'innovations agricoles en Grand Est",
                "Complexe agricole du Mont Bernard, Route de Suippes, 51000 Châlons-en-Champagne",
                "http://terrasolis.fr/"
            },
            {
                "CRAGE",
                "https://marne.chambre-agriculture.fr/fileadmin/user_upload/Grand-Est/047_Inst_Marne/Interface/logo_ca51.jpg", 
                "Organisation consulaire de représentation des agriculteurs portant des actions de développement / Grand Est",
                "Complexe agricole du Mont Bernard, Route de Suippes, 51000 Châlons-en-Champagne",
                "https://grandest.chambre-agriculture.fr/"
            },
            {   
                "Chambre d'agriculture de la marne",
                "https://marne.chambre-agriculture.fr/fileadmin/user_upload/Grand-Est/047_Inst_Marne/Interface/logo_ca51.jpg", 
                "Organisation consulaire de représentation des agriculteurs portant des actions de développement / Marne",
                "Complexe agricole du Mont Bernard, Route de Suippes, 51000 Châlons-en-Champagne",
                "https://marne.chambre-agriculture.fr/"
            },
            {
                "Soufflet",
                "https://www.soufflet.com/themes/custom/gs_theme/images/logo/fr/logo.svg", 
                "Groupe agro-alimentaire (collecte & transformation)",
                "10400 Nogent-sur-Seine",
                "https://www.soufflet.com"
            },
             {
                "Vivescia",
                "https://www.vivescia.com/sites/all/themes/custom_ins/logo.svg",
                "Coopérative agricole engagée dans la première transformation",
                "2 Rue Clément Ader, 51100 Reims",
                "https://www.vivescia.com"
            },    
            {
                "Ceresia",
                "https://www.investinreims.com/sites/default/files/inline-images/Logo-C%C3%A9r%C3%A8sia.jpg",
                "Groupe coopératif agricole, viticole et élevage issue de la fusion d'Acolyance et de Cerena",
                "16 Boulevard du Val de Vesle, 51100 Reims",
                "https://acolyance.fr"
            },    
            {
                "Cristal Union",
                "https://pbs.twimg.com/profile_images/468405186302443522/ExB_Sxm0_400x400.jpeg",
                "Groupe coopératif betteravier",
                "1 Rue Daddy, 51430 Bezannes",
                "https://www.cristal-union.fr/"
            },  
            {
                "la Fédération Départementale des Syndicats d’Exploitants Agricoles de la Marne.",
                "https://scontent-cdt1-1.xx.fbcdn.net/v/t1.0-9/63438_135636176494244_1126738_n.jpg?_nc_cat=110&_nc_oc=AQmumyL-9e3lw-zOtIdP2RK0xLWDYxbRZ4NKGqynie6XBXrrqLe64T0WIL8Nrj_eVxs&_nc_ht=scontent-cdt1-1.xx&oh=f7d383045ca7822a45f692ac5542be57&oe=5DFDB1FA",
                "Syndicat agricole entouré de 8 entités : comptabilité, informatique, communication, désinfection…",
                "Maison des Agriculteurs, 2 Rue Léon Patoux, 51100 Reims",
                "http://www.fdsea51.fr/"
            },  
            {
                "CDER",
                "https://yt3.ggpht.com/a/AGF-l7_mOaDudqohCb17gtgUZCMkYl7iQ8NNV1VX-A=s900-mo-c-c0xffffffff-rj-k-no",
                "Expertise comptable, conseil aux entreprises et aux particuliers",
                "ZAC Les Charmilles, 3 Allée Thierry Sabine, 51686 Reims",
                "http://www.cder.fr/"
            },  
            {
                "IAR",
                "https://pbs.twimg.com/profile_images/723063489351286784/Htqbk0UW_400x400.jpg",
                "Pôle de compétitivité de la Bioéconomie",
                "35 rue René Cassin, 51 430 Bezannes",
                "https://www.iar-pole.com/"
            },  
            {
                "CREDIT AGRICOLE Nord Est",
                "https://www.ca-nord-est.fr/Vitrine/ObjCommun/DCIV2/img/logo_creditagricole_V16.png",
                "Banque mutualiste",
                "25 Rue Libergier, 51100 Reims",
                "https://www.ca-nord-est.fr/"
            },  
            {
                "Arvalis",
                "https://yt3.ggpht.com/a/AGF-l7-5YZ4gLEFreds5p0JjZUMtQJp4Ho7vxQkL5Q=s900-c-k-c0xffffffff-no-rj-mo",
                "Institut technique agricole des céréales et autres grandes cultures",
                "Ruelle du Chemin de Suippes, 51000 Châlons-en-Champagne",
                "https://www.arvalisinstitutduvegetal.fr"
            },  
            {
                "RITTMO",
                "https://pbs.twimg.com/profile_images/3111793661/12b17c1a7835e3a959b9508b83ecd3a4_400x400.jpegs",
                "Centre de recherche spécialisé dans les domaines de la fertilisation et de l’agroenvironnement",
                "37 Rue de Herrlisheim, 68000 Colmar",
                "https://www.rittmo.com/"
            },  
            {
                "CIVC",
                "https://www.champagne.fr/assets/img/logo-civc.svg",
                "Interprofession rassemblant les vignerons et maisons de Champagne pour le développement économique, technique, environnementale de la filière",
                "21 Rue Georges Clemenceau, 51480 Damery",
                "https://www.champagne.fr/"
            },  
           {
                "SYNERGIE EST",
                "https://scontent-cdt1-1.xx.fbcdn.net/v/t1.0-9/430640_130620243756688_1442652376_n.jpg?_nc_cat=108&_nc_oc=AQmPgpGDMWizgbOEHGjTiw_J4ZOgyQgTLged-JWdsHjQagsQts_C5LFbXVGPTlbyu74&_nc_ht=scontent-cdt1-1.xx&oh=ae83e822bb27af304307022ec4be0dd9&oe=5E3A67BD",
                "Union de coopératives de services numériques aux organismes d'élevage",
                "4 Rue des Épicéas, 25640 Roulans",
                "https://goo.gl/maps/yTYWag1wG6kB7sTbA"
            },  
            {
                "ENSAIA",
                "http://dev.meilleures-licences.com/logo_ecole/logo_ENSAIA_20101104150119.png",
                "École nationale supérieure d'agronomie et des industries alimentaires",
                "2 Avenue de la Forêt de Haye, 54505 Vandœuvre-lès-Nancy",
                "https://goo.gl/maps/foQSjrgoZrSe6W98A"
            },
            {
                "GRDF",
                "https://upload.wikimedia.org/wikipedia/fr/thumb/c/cb/GRDF_%282008-2015%29.svg/115px-GRDF_%282008-2015%29.svg.png",
                "Distribution de gaz naturel en France",
                "6 rue Condorcet; 75009 Paris",
                "https://www.grdf.fr/"
            },
             {
                "INVIVO",
                "https://www.invivo-group.com/sites/default/files/logo_invivo_hd_rvb-01.png",
                "Union nationale de coopératives agricoles (collecte, approvisionnement, jardinerie…)",
                "83 Avenue de la Grande-Armée, 75116 Paris",
                "https://www.invivo-group.com/"
            },
           {
                "CRESTIC",
                "https://www.univ-reims.fr/eisine/media-images/20561/crestic.jpg",
                "Centre de Recherche en Sciences et Technologies de l'Information et de la Communication de l'Université de Reims Champagne Ardenne",
                "UFR Sciences Exactes et Naturelles, Moulin de la Housse, 51867 Reims",
                "https://crestic.univ-reims.fr/"
            },
            {
                "ARTECHDRONE",
                "https://www.artechdrone.fr/wp-content/uploads/2017/01/Logo-Artechdrone-horizontal-250.png",
                "Entreprise de drone (formation, vol…)",
                "5 bis Avenue André Margot, 51100 Reims",
                "https://www.artechdrone.fr/"
            },
            {
                "EMC2",
                "https://media.licdn.com/dms/image/C4E0BAQHV5A5hbodusA/company-logo_400_400/0?e=1576713600&v=beta&t=M5LV0K5AH5aPYC_YYA1gf_wrzyceNG8EHZTaYtPdAhI",
                "Coopérative agricole en grandes cultures, élevage et machinisme",
                "Espace Agricole Nid de Cygne, D964, 55100 Bras-sur-Meuse",
                "https://www.avenir.coop/coop/"
            },
            {
                "ARYSTA",
                "https://www2.agrositio.com.ar/imagenes_contenidos/v_201861_82693783.jpg",
                "Entreprise de protection phytopharmaceutiques et biologiques",
                "Tour Cristal, 7 11Quai André Citroën, 75015 Paris",
                "http://www.arystalifescience.fr/"
            },
            {
                "API-AGRO",
                "https://static.data.gouv.fr/avatars/f5/fd0629ff634b8fa8a94d80970189b7.png",
                "Plateforme d'échanges de données utiles au secteur agricole",
                "149 Rue de Bercy, 75012 Paris",
                "https://api-agro.eu/"
            }
        };
        for(String[] companyData : data) {
            Company company = new Company(companyData[0], companyData[1], companyData[2], companyData[3], companyData[4]);
            companyRepository.save(company);
        }
    }    
}