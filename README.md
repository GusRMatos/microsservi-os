<h1 class="code-line" data-line-start=0 data-line-end=1 ><a id="Microservices_project_0"></a>Microservices project</h1>
<h2 class="code-line" data-line-start=2 data-line-end=3 ><a id="About_2"></a>About</h2>
<h3 class="code-line" data-line-start=3 data-line-end=4 ><a id="Microservices_project_developed_at_the_Santander_bootcamp_3"></a>Microservices project developed at the Santander bootcamp</h3>
<h1 class="code-line" data-line-start=5 data-line-end=7 ><a id="GitHub_issueshttpsimgshieldsiogithubissuesGusRMatosmicrosservicoshttpsgithubcomGusRMatosmicrosservicosissues_GitHub_forkshttpsimgshieldsiogithubforksGusRMatosmicrosservicoshttpsgithubcomGusRMatosmicrosservicosnetwork_GitHub_starshttpsimgshieldsiogithubstarsGusRMatosmicrosservicoshttpsgithubcomGusRMatosmicrosservicosstargazers__GitHub_licensehttpsimgshieldsiogithublicenseGusRMatosmicrosservicoshttpsgithubcomGusRMatosmicrosservicos_5"></a><a href="https://github.com/GusRMatos/microsservicos/issues"><img src="https://img.shields.io/github/issues/GusRMatos/microsservicos" alt="GitHub issues"></a> <a href="https://github.com/GusRMatos/microsservicos/network"><img src="https://img.shields.io/github/forks/GusRMatos/microsservicos" alt="GitHub forks"></a> <a href="https://github.com/GusRMatos/microsservicos/stargazers"><img src="https://img.shields.io/github/stars/GusRMatos/microsservicos" alt="GitHub stars"></a>  <a href="https://github.com/GusRMatos/microsservicos"><img src="https://img.shields.io/github/license/GusRMatos/microsservicos" alt="GitHub license"></a></h1>
<p class="has-line-data" data-line-start="7" data-line-end="8"><a href="#About">about</a> | <a href="#Requirements">requirements</a> | <a href="#Features">Features</a> | <a href="#tools-used-in-implementation">Tools</a></p>
<h2 class="code-line" data-line-start=8 data-line-end=9 ><a id="Requiriments_8"></a>Requiriments</h2>
<ul>
<li class="has-line-data" data-line-start="9" data-line-end="10">java 8 onwards</li>
<li class="has-line-data" data-line-start="10" data-line-end="11">Spring boot 2.5.3</li>
<li class="has-line-data" data-line-start="11" data-line-end="12">springCloud 2020.0.3</li>
<li class="has-line-data" data-line-start="12" data-line-end="13">Gradle</li>
<li class="has-line-data" data-line-start="13" data-line-end="14">elasticsearch 2.4.0</li>
<li class="has-line-data" data-line-start="14" data-line-end="15">redis</li>
</ul>
<h2 class="code-line" data-line-start=15 data-line-end=16 ><a id="Features_15"></a>Features</h2>
<ul>
<li class="has-line-data" data-line-start="16" data-line-end="17">Gateway</li>
<li class="has-line-data" data-line-start="17" data-line-end="18">Server Configuration</li>
<li class="has-line-data" data-line-start="18" data-line-end="19">Service Discovery</li>
<li class="has-line-data" data-line-start="19" data-line-end="20">Product Catalog crud</li>
<li class="has-line-data" data-line-start="20" data-line-end="22">Shoping Cart crud</li>
</ul>
<h2 class="code-line" data-line-start=22 data-line-end=23 ><a id="Tools_used_in_implementation_22"></a>Tools used in implementation</h2>
<ul>
<li class="has-line-data" data-line-start="23" data-line-end="24">IntelliJ IDEA Community Edition 2021.1.3</li>
<li class="has-line-data" data-line-start="24" data-line-end="25">Eureka</li>
<li class="has-line-data" data-line-start="25" data-line-end="26">Elasticsearch</li>
<li class="has-line-data" data-line-start="26" data-line-end="28">redis</li>
</ul>
<h2 class="code-line" data-line-start=28 data-line-end=29 ><a id="BuildGradle_Config_Server_28"></a>BuildGradle Config Server</h2>
<p class="has-line-data" data-line-start="29" data-line-end="34">plugins {<br>
id ‘org.springframework.boot’ version ‘2.5.3’<br>
id ‘io.spring.dependency-management’ version ‘1.0.11.RELEASE’<br>
id ‘java’<br>
}</p>
<p class="has-line-data" data-line-start="35" data-line-end="38">group = ‘com.example’<br>
version = ‘0.0.1-SNAPSHOT’<br>
sourceCompatibility = ‘11’</p>
<p class="has-line-data" data-line-start="39" data-line-end="42">repositories {<br>
mavenCentral()<br>
}</p>
<p class="has-line-data" data-line-start="43" data-line-end="46">ext {<br>
set(‘springCloudVersion’, “2020.0.3”)<br>
}</p>
<p class="has-line-data" data-line-start="47" data-line-end="53">dependencies {<br>
implementation ‘org.springframework.boot:spring-boot-starter-actuator’<br>
implementation ‘org.springframework.boot:spring-boot-starter-web’<br>
implementation ‘org.springframework.cloud:spring-cloud-config-server’<br>
testImplementation ‘org.springframework.boot:spring-boot-starter-test’<br>
}</p>
<p class="has-line-data" data-line-start="54" data-line-end="59">dependencyManagement {<br>
imports {<br>
mavenBom “org.springframework.cloud:spring-cloud-dependencies:${springCloudVersion}”<br>
}<br>
}</p>
<p class="has-line-data" data-line-start="60" data-line-end="63">test {<br>
useJUnitPlatform()<br>
}</p>
<h2 class="code-line" data-line-start=64 data-line-end=65 ><a id="BuildGradle_Gateway_64"></a>BuildGradle Gateway</h2>
<p class="has-line-data" data-line-start="66" data-line-end="71">plugins {<br>
id ‘org.springframework.boot’ version ‘2.5.3’<br>
id ‘io.spring.dependency-management’ version ‘1.0.11.RELEASE’<br>
id ‘java’<br>
}</p>
<p class="has-line-data" data-line-start="72" data-line-end="75">group = ‘com.example’<br>
version = ‘0.0.1-SNAPSHOT’<br>
sourceCompatibility = ‘11’</p>
<p class="has-line-data" data-line-start="76" data-line-end="79">repositories {<br>
mavenCentral()<br>
}</p>
<p class="has-line-data" data-line-start="80" data-line-end="83">ext {<br>
set(‘springCloudVersion’, “2020.0.3”)<br>
}</p>
<p class="has-line-data" data-line-start="84" data-line-end="90">dependencies {<br>
implementation ‘org.springframework.boot:spring-boot-starter-actuator’<br>
implementation ‘org.springframework.cloud:spring-cloud-starter-gateway’<br>
testImplementation ‘org.springframework.boot:spring-boot-starter-test’<br>
implementation ‘org.springframework.cloud:spring-cloud-starter-netflix-eureka-client’<br>
}</p>
<p class="has-line-data" data-line-start="91" data-line-end="96">dependencyManagement {<br>
imports {<br>
mavenBom “org.springframework.cloud:spring-cloud-dependencies:${springCloudVersion}”<br>
}<br>
}</p>
<p class="has-line-data" data-line-start="97" data-line-end="100">test {<br>
useJUnitPlatform()<br>
}</p>
<h2 class="code-line" data-line-start=101 data-line-end=102 ><a id="BuildGradle_Product_Catalog_101"></a>BuildGradle Product_Catalog</h2>
<p class="has-line-data" data-line-start="103" data-line-end="108">plugins {<br>
id ‘org.springframework.boot’ version ‘2.2.6.RELEASE’<br>
id ‘io.spring.dependency-management’ version ‘1.0.11.RELEASE’<br>
id ‘java’<br>
}</p>
<p class="has-line-data" data-line-start="109" data-line-end="112">group = ‘course.microservices.dio’<br>
version = ‘0.0.1-SNAPSHOT’<br>
sourceCompatibility = ‘1.8’</p>
<p class="has-line-data" data-line-start="113" data-line-end="116">repositories {<br>
mavenCentral()<br>
}</p>
<p class="has-line-data" data-line-start="117" data-line-end="124">dependencies {<br>
implementation ‘org.springframework.boot:spring-boot-starter-actuator’<br>
implementation ‘org.springframework.boot:spring-boot-starter-data-elasticsearch:2.4.0’<br>
implementation ‘org.springframework.boot:spring-boot-starter-web’<br>
testImplementation ‘org.springframework.boot:spring-boot-starter-test’<br>
implementation ‘org.springframework.cloud:spring-cloud-starter-config’<br>
implementation ‘org.springframework.cloud:spring-cloud-starter-netflix-eureka-client’</p>
<p class="has-line-data" data-line-start="125" data-line-end="126">}</p>
<p class="has-line-data" data-line-start="127" data-line-end="130">test {<br>
useJUnitPlatform()<br>
}</p>
<h2 class="code-line" data-line-start=131 data-line-end=132 ><a id="BuildGradle_Shopping_Cart_131"></a>BuildGradle Shopping_Cart</h2>
<p class="has-line-data" data-line-start="133" data-line-end="138">plugins {<br>
id ‘org.springframework.boot’ version ‘2.5.3’<br>
id ‘io.spring.dependency-management’ version ‘1.0.11.RELEASE’<br>
id ‘java’<br>
}</p>
<p class="has-line-data" data-line-start="139" data-line-end="142">group = ‘com.projeto_microsservissos’<br>
version = ‘0.0.1-SNAPSHOT’<br>
sourceCompatibility = ‘11’</p>
<p class="has-line-data" data-line-start="143" data-line-end="146">repositories {<br>
mavenCentral()<br>
}</p>
<p class="has-line-data" data-line-start="147" data-line-end="156">dependencies {<br>
implementation ‘org.springframework.boot:spring-boot-starter-actuator’<br>
implementation ‘org.springframework.boot:spring-boot-starter-data-elasticsearch’<br>
implementation ‘org.springframework.boot:spring-boot-starter-web’<br>
testImplementation ‘org.springframework.boot:spring-boot-starter-test’<br>
implementation “org.springframework.data:spring-data-redis:1.8.0.RELEASE”<br>
implementation “redis.clients:jedis:2.9.0”<br>
implementation ‘org.springframework.cloud:spring-cloud-starter-config’<br>
}</p>
<p class="has-line-data" data-line-start="157" data-line-end="160">test {<br>
useJUnitPlatform()<br>
}</p>
<h2 class="code-line" data-line-start=161 data-line-end=162 ><a id="BuildGradle_Service_Discovery_161"></a>BuildGradle Service_Discovery</h2>
<p class="has-line-data" data-line-start="163" data-line-end="168">plugins {<br>
id ‘org.springframework.boot’ version ‘2.5.3’<br>
id ‘io.spring.dependency-management’ version ‘1.0.11.RELEASE’<br>
id ‘java’<br>
}</p>
<p class="has-line-data" data-line-start="169" data-line-end="172">group = ‘com.example’<br>
version = ‘0.0.1-SNAPSHOT’<br>
sourceCompatibility = ‘11’</p>
<p class="has-line-data" data-line-start="173" data-line-end="176">repositories {<br>
mavenCentral()<br>
}</p>
<p class="has-line-data" data-line-start="177" data-line-end="180">ext {<br>
set(‘springCloudVersion’, “2020.0.3”)<br>
}</p>
<p class="has-line-data" data-line-start="181" data-line-end="187">dependencies {<br>
implementation ‘org.springframework.cloud:spring-cloud-starter-config’<br>
implementation ‘org.springframework.cloud:spring-cloud-starter-netflix-eureka-server’<br>
testImplementation ‘org.springframework.boot:spring-boot-starter-test’<br>
implementation ‘org.springframework.cloud:spring-cloud-starter-netflix-eureka-client’<br>
}</p>
<p class="has-line-data" data-line-start="188" data-line-end="193">dependencyManagement {<br>
imports {<br>
mavenBom “org.springframework.cloud:spring-cloud-dependencies:${springCloudVersion}”<br>
}<br>
}</p>
<p class="has-line-data" data-line-start="194" data-line-end="197">test {<br>
useJUnitPlatform()<br>
}</p>
<h1 class="code-line" data-line-start=198 data-line-end=199 ><a id="__Spring_Boot_Api__under_development___198"></a>🚧  Spring Boot Api 🚀 under development…  🚧</h1>