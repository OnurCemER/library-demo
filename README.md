#Nasıl Kurulur?
Uygulamayı kendi bilgisayarınıza indirmek için komut satırınızdan "git clone https://github.com/OnurCemER/library-demo.git" komutunu çalıştırın. Ardından uygulamayı geliştirme ortamınızda açabilirsiniz.

#Nasıl Çalışır?
Projenin çalışır hale gelmesi için öncelikle MAVEN komut satırından "mvn install" ya da "mvn clean install" komutu kullanılarak uygulamanın derlenmesi sağlanmalıdır. Ardından elde edilen JAR dosyasını istediğiniz sunucuda kullanabilirsiniz.

#Geliştirme Aşamaları

##Projeye Ait Entity Yapısının Oluşturulması
Entity nesnelerinin oluşturulması için öncelikle ilgili nesnelerin repositoryleri oluşturulmuştur. Bu repositoryler JpaRepository arayüzünden türetilerek JpaRepositorynin yeteneklerinden yararlanılmıştır. JpaRepository içinde yer almayan metodlar için yeni metodlar oluşturularak veritabanı sorgularının ilgili uygulamaya özel olması sağlanmıştır. Burada kullanılan yöntem ile herhangi bir SQL sorgusu yazmadan tamamen JpaRepository arayüzünün yeteneklerinden yararlanılarak arama işlemleri için metodlar yazılmıştır. JpaRepositorynin query metodları ile SQL sorgusu yazmadan kitap adına, kitap seri numarasına ve kitabın ISBN numarasına göre arama yapılması sağlanmıştır. Burada yapılan aramalarda kullanıcının birebir yazma zorunluluğunu kaldırmak için kullanıcının belirttiği kadar değerle arama yaparak değerin içinde geçtiği tüm kayıtları listelemektedir.

##Entity Nesnesine Erişimin Sağlanması
Entity nesnelerine erişim sağlanırken genel kabul görmüş olan mantığa uygun olması bakımından ve SOLID prensiplerinin Open-Closed prensibine uygunluğu açısından servis katmanında erişim için öncelikle arayüzler oluşturulup bu arayüzlerde uygulamanın ihtiyaç duyduğu metodlar belirtilerek ardından bu arayüzlerin implementasyonu yapılmıştır. İmplementasyonun ardından kitap sınıfı özelinde bir Data Transfer Objesi oluşturularak görüntülenmek istenen yapı bu obje içerisinde oluşturulmuştur.

##Servis Edilen Verilerin Görüntüleneceği Endpointlerin Belirlenmesi
Uygulamanın kullanıcı ile etkileşime geçeceği adresleri ve bu adresler içerisindeki görevlerin kodlaması yapılarak kullanıcı arayüzünde gösterilecek verilerin gösterim formatları ve etkileşimli işlemlerin (Create, Update, Delete vb.) kodlaması yapılmıştır.

##Uygulama Arayüzünün Oluşturulması
Uygulama arayüzü oluşturulurken verilerin karmaşık görüntülenmemesi için tablo yapısından faydalanılmıştır. Kullanıcının etkileşimde bulunacağı alanlar butonlar ile gösterilerek kullanıcının yönlendirilmesi sağlandı. Kullanıcının etkileşimde bulunduğu alanların görsel olarak da iyileştirilmesi için bootstrap kütüphanesine başvuruldu.
