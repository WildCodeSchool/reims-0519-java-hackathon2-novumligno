package fr.novumligno.novumligno.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import fr.novumligno.novumligno.entities.Company;
import fr.novumligno.novumligno.repositories.CompanyRepository;;

@Component
public class CompanyOutputter implements CommandLineRunner {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public void run(String... args) throws Exception {


        companyRepository.deleteAll();


        String[][] data = new String[][]{
            {
                "TerraSolis",
                "http://terrasolis.fr/wp-content/uploads/2017/08/terrasolis-e1504170220736.png",
                "Association de promotion de la multifonctionnalité via l'émergence d'innovations agricoles en Grand Est",
                "https://goo.gl/maps/hgMxNQ78aymewbBM9",
                "http://terrasolis.fr/",
                "Agriculture =  Grandes cultures + Elevage + Viticulture"
            },
            {
                "CRAGE",
                "https://marne.chambre-agriculture.fr/fileadmin/user_upload/Grand-Est/047_Inst_Marne/Interface/logo_ca51.jpg", 
                "Organisation consulaire de représentation des agriculteurs portant des actions de développement / Grand Est",
                "https://goo.gl/maps/bREAhBkmZpPHYjaF8",
                "https://grandest.chambre-agriculture.fr/",
                "Agriculture"
            },
            {   
                "CA51",
                "https://marne.chambre-agriculture.fr/fileadmin/user_upload/Grand-Est/047_Inst_Marne/Interface/logo_ca51.jpg", 
                "Organisation consulaire de représentation des agriculteurs portant des actions de développement / Marne",
                "https://goo.gl/maps/hgMxNQ78aymewbBM9",
                "https://marne.chambre-agriculture.fr/",
                "Agriculture"
            },
            {
                "Soufflet",
                "https://www.soufflet.com/themes/custom/gs_theme/images/logo/fr/logo.svg", 
                "Groupe agro-alimentaire (collecte & transformation)",
                "https://goo.gl/maps/zuHyYsHkSYnoEJx97",
                "https://www.soufflet.com",
                "Grandes cultures, Légumes secs, Viticulture"
            },
             {
                "Vivescia",
                "https://image.noelshack.com/fichiers/2019/38/5/1568937466-pngtree-creative-company-logo-1421161.png",
                "Coopérative agricole engagée dans la première transformation",
                "https://goo.gl/maps/FPAm24YPKCYTrKSV8",
                "https://www.vivescia.com",
                "Grandes cultures"
             },
            {
                "Ceresia",
                "https://www.investinreims.com/sites/default/files/inline-images/Logo-C%C3%A9r%C3%A8sia.jpg",
                "Groupe coopératif agricole, viticole et élevage issue de la fusion d'Acolyance et de Cerena",
                "https://goo.gl/maps/epvMKwCLjLzycevA8",
                "https://acolyance.fr",
                "Agriculture"
            },    
            {
                "Cristal Union",
                "https://pbs.twimg.com/profile_images/468405186302443522/ExB_Sxm0_400x400.jpeg",
                "Groupe coopératif betteravier",
                "https://goo.gl/maps/vDNCTTCCnvsjpz967",
                "https://www.cristal-union.fr/",
                "Betterave"
            },  
            {
                "la Fédération Départementale des Syndicats d’Exploitants Agricoles de la Marne.",
                "https://scontent-cdt1-1.xx.fbcdn.net/v/t1.0-9/63438_135636176494244_1126738_n.jpg?_nc_cat=110&_nc_oc=AQmumyL-9e3lw-zOtIdP2RK0xLWDYxbRZ4NKGqynie6XBXrrqLe64T0WIL8Nrj_eVxs&_nc_ht=scontent-cdt1-1.xx&oh=f7d383045ca7822a45f692ac5542be57&oe=5DFDB1FA",
                "Syndicat agricole entouré de 8 entités : comptabilité, informatique, communication, désinfection…",
                "https://goo.gl/maps/4w67xYW9yy5AWapn6",
                "http://www.fdsea51.fr/",
                "Agriculture"
            },  
            {
                "CDER",
                "https://yt3.ggpht.com/a/AGF-l7_mOaDudqohCb17gtgUZCMkYl7iQ8NNV1VX-A=s900-mo-c-c0xffffffff-rj-k-no",
                "Expertise comptable, conseil aux entreprises et aux particuliers",
                "https://goo.gl/maps/cQ8gs1dXBrYP2Ki8A",
                "http://www.cder.fr/",
                "Agriculture"
            },  
            {
                "IAR",
                "https://pbs.twimg.com/profile_images/723063489351286784/Htqbk0UW_400x400.jpg",
                "Pôle de compétitivité de la Bioéconomie",
                "https://goo.gl/maps/xEZ511sM579zdBp19",
                "https://www.iar-pole.com/",
                "Bioéconomie"
            },  
            {
                "CREDIT AGRICOLE Nord Est",
                "https://www.ca-nord-est.fr/Vitrine/ObjCommun/DCIV2/img/logo_creditagricole_V16.png",
                "Banque mutualiste",
                "https://goo.gl/maps/gP9w9CCiZBP83jk47",
                "https://www.ca-nord-est.fr/",
                "Agriculture"
            },  
            {
                "Arvalis",
                "https://yt3.ggpht.com/a/AGF-l7-5YZ4gLEFreds5p0JjZUMtQJp4Ho7vxQkL5Q=s900-c-k-c0xffffffff-no-rj-mo",
                "Institut technique agricole des céréales et autres grandes cultures",
                "https://goo.gl/maps/XGjRAriKsmJwWNN7A",
                "https://www.arvalisinstitutduvegetal.fr",
                "Grandes cultures"
            },  
            {
                "RITTMO",
                "https://image.noelshack.com/fichiers/2019/38/5/1568937466-pngtree-creative-company-logo-1421161.png",
                "Centre de recherche spécialisé dans les domaines de la fertilisation et de l’agroenvironnement",
                "https://image.noelshack.com/fichiers/2019/38/5/1568937466-pngtree-creative-company-logo-1421161.png",
                "https://www.rittmo.com/",
                "Fertilisants"
            },  
            {
                "CIVC",
                "https://www.champagne.fr/assets/img/logo-civc.svg",
                "Interprofession rassemblant les vignerons et maisons de Champagne pour le développement économique, technique, environnementale de la filière",
                "https://image.noelshack.com/fichiers/2019/38/5/1568937466-pngtree-creative-company-logo-1421161.png",
                "https://www.champagne.fr/",
                "Viticulture"
            },  
           {
                "SYNERGIE EST",
                "https://scontent-cdt1-1.xx.fbcdn.net/v/t1.0-9/430640_130620243756688_1442652376_n.jpg?_nc_cat=108&_nc_oc=AQmPgpGDMWizgbOEHGjTiw_J4ZOgyQgTLged-JWdsHjQagsQts_C5LFbXVGPTlbyu74&_nc_ht=scontent-cdt1-1.xx&oh=ae83e822bb27af304307022ec4be0dd9&oe=5E3A67BD",
                "Union de coopératives de services numériques aux organismes d'élevage",
                "https://goo.gl/maps/u7Eq3zPQu8C2Xm5fA",
                "https://www.societe.com/societe/synergie-est-rsoe-union-de-cooperatives-de-services-aux-organismes-d-elevage-et-d-exploitation-des-donnees-313967945.html",
                "Elevage"
            },  
            {
                "ENSAIA",
                "http://dev.meilleures-licences.com/logo_ecole/logo_ENSAIA_20101104150119.png",
                "École nationale supérieure d'agronomie et des industries alimentaires",
                "https://goo.gl/maps/foQSjrgoZrSe6W98A",
                "http://ensaia.univ-lorraine.fr/",
                "Agriculture"
            },
            {
                "GRDF",
                "https://upload.wikimedia.org/wikipedia/fr/thumb/c/cb/GRDF_%282008-2015%29.svg/115px-GRDF_%282008-2015%29.svg.png",
                "Distribution de gaz naturel en France",
                "https://goo.gl/maps/J21vjuzH2mBhP7d1A",
                "https://www.grdf.fr/",
                "Energie"
            },
             {
                "INVIVO",
                "https://www.invivo-group.com/sites/default/files/logo_invivo_hd_rvb-01.png",
                "Union nationale de coopératives agricoles (collecte, approvisionnement, jardinerie…)",
                "https://goo.gl/maps/LUzSLU3vfmsErwcK6",
                "https://www.invivo-group.com/",
                "Agriculture"
            },
           {
                "CRESTIC",
                "https://www.univ-reims.fr/eisine/media-images/20561/crestic.jpg",
                "Centre de Recherche en Sciences et Technologies de l'Information et de la Communication de l'Université de Reims Champagne Ardenne",
                "https://goo.gl/maps/YqGEVj9J5vV2Kn9N7",
                "https://crestic.univ-reims.fr/",
                "Numérique	Numérique"
            },
            {
                "ARTECHDRONE",
                "https://image.noelshack.com/fichiers/2019/38/5/1568937466-pngtree-creative-company-logo-1421161.png",
                "Entreprise de drone (formation, vol…)",
                "https://goo.gl/maps/j4GBwk2rf7QsFPo56",
                "https://www.artechdrone.fr/",
                "Drone"
            },
            {
                "EMC2",
                "https://media.licdn.com/dms/image/C4E0BAQHV5A5hbodusA/company-logo_400_400/0?e=1576713600&v=beta&t=M5LV0K5AH5aPYC_YYA1gf_wrzyceNG8EHZTaYtPdAhI",
                "Coopérative agricole en grandes cultures, élevage et machinisme",
                "https://goo.gl/maps/htzUbE9CLt8Bhvn38",
                "https://www.avenir.coop/coop/",
                "Agriculture"
            },
            {
                "ARYSTA",
                "https://www2.agrositio.com.ar/imagenes_contenidos/v_201861_82693783.jpg",
                "Entreprise de protection phytopharmaceutiques et biologiques",
                "https://goo.gl/maps/ZKZQcKajnLXiBCgJ9",
                "http://www.arystalifescience.fr/",
                "Phytopharmacie"
            },
            {
                "API-AGRO",
                "https://static.data.gouv.fr/avatars/f5/fd0629ff634b8fa8a94d80970189b7.png",
                "Plateforme d'échanges de données utiles au secteur agricole",
                "https://goo.gl/maps/6y3T8xBgRCQAueaf6",
                "https://api-agro.eu/",
                "Numérique"
            }
        };
        for(String[] companyData : data) {
            Company company = new Company(companyData[0], companyData[1], companyData[2], companyData[3], companyData[4], companyData[5]);
            companyRepository.save(company);
        }
    }    
}