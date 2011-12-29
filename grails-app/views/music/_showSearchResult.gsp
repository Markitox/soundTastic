<g:each in="${searchResult}" var="result" >
	<a href='${result.url}'>${result.name}</a><br/>
	Descripción: ${result.wikiSummary}
</g:each>