<h1>Java Spring Whisky Tracker</h1>
<h2>Brief</h2>
<p>Given the basic code for classes and JpaRepositories for a whisky tracker, the task is to complete the custom queries and connected them to appropriate RESTful endpoints.</p>

<h4>Whisky</h4>

<p><code>name</code> - the name of that individual whisky often uses the name of the distillery. An example is “The Glendronach - Revival” which is from “Glendronach” distillery</p>
<p><code>distillery</code> - the distillery object that it’s related to</p>
<p><code>year</code> - the year edition that the whisky was released/ bottled. The year is not a way of determining the age.</p>
<p><code>age</code> - how long the whisky in the bottle was matured for before bottling</p>

<h4>Distillery</h4>

<p><code>name</code> - The name of the whisky distillery.</p>
<p><code>region</code> - The region of scotland where the whisky is from. These are one of either {Lowlands, Speyside, Highlands, Islay, Campbelltown, Island }</p>
<p><code>whiskys</code> - the list of related whiskies tracked against that distillery</p>

<h4>Task</h4>
<p>Write each of the following queries and connect them to an appropriate controller:</p>
<h3>MVP</h3>
<ul>
<li>Get all the whiskies for a particular year</li>
<li>Get all the distilleries for a particular region</li>
<li>Get all the whisky from a particular distillery that’s a specific age</li>
</ul>
<h3>Extensions</h3>
<ul>
<li>Get all the whisky from a particular region</li>
<li>Get distilleries that have whiskies that are 12 years old</li>
</ul>
