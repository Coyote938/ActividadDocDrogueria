# Actividad Docucumentación Drogueria

# Casos de uso
<?xml version="1.0" encoding="UTF-8"?>
<mxfile host="app.diagrams.net" modified="2023-05-11T02:09:10.344Z" agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36" etag="NF7tyLokCPeLtiN9IZDO" version="21.2.9" type="device">
  <diagram name="Página-1" id="YnBZi_pNWh4N_Y3MXdSg">
    <mxGraphModel dx="880" dy="1653" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="827" pageHeight="1169" math="0" shadow="0">
      <root>
        <mxCell id="0" />
        <mxCell id="1" parent="0" />
        <mxCell id="9bJN26KlkBRv8N70o3ud-7" value="" style="rounded=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="200" y="20" width="240" height="710" as="geometry" />
        </mxCell>
        <mxCell id="9bJN26KlkBRv8N70o3ud-8" value="Cliente" style="shape=umlActor;verticalLabelPosition=bottom;verticalAlign=top;html=1;outlineConnect=0;" vertex="1" parent="1">
          <mxGeometry x="130" y="70" width="30" height="60" as="geometry" />
        </mxCell>
        <mxCell id="9bJN26KlkBRv8N70o3ud-9" value="Gerente" style="shape=umlActor;verticalLabelPosition=bottom;verticalAlign=top;html=1;outlineConnect=0;" vertex="1" parent="1">
          <mxGeometry x="140" y="370" width="30" height="60" as="geometry" />
        </mxCell>
        <mxCell id="9bJN26KlkBRv8N70o3ud-11" value="Empleado" style="shape=umlActor;verticalLabelPosition=bottom;verticalAlign=top;html=1;outlineConnect=0;" vertex="1" parent="1">
          <mxGeometry x="140" y="570" width="30" height="60" as="geometry" />
        </mxCell>
        <mxCell id="9bJN26KlkBRv8N70o3ud-12" value="Busqueda y selección de productos" style="ellipse;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="240" y="30" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="9bJN26KlkBRv8N70o3ud-13" value="Solicitar domicilio" style="ellipse;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="240" y="130" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="9bJN26KlkBRv8N70o3ud-15" value="Aplicativo web" style="text;html=1;strokeColor=none;fillColor=none;align=center;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="1">
          <mxGeometry x="200" y="-10" width="90" height="30" as="geometry" />
        </mxCell>
        <mxCell id="9bJN26KlkBRv8N70o3ud-16" value="Visualizar descripción producto" style="ellipse;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="240" y="220" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="9bJN26KlkBRv8N70o3ud-21" value="Administración de inventario" style="ellipse;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="240" y="360" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="9bJN26KlkBRv8N70o3ud-23" value="Escaneo de los productos" style="ellipse;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="250" y="520" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="9bJN26KlkBRv8N70o3ud-25" value="Gestión de turnos" style="ellipse;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="250" y="630" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="9bJN26KlkBRv8N70o3ud-27" value="" style="endArrow=none;html=1;rounded=0;" edge="1" parent="1">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="520" y="600" as="sourcePoint" />
            <mxPoint x="520" y="520" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="9bJN26KlkBRv8N70o3ud-29" value="" style="endArrow=none;html=1;rounded=0;" edge="1" parent="1" source="9bJN26KlkBRv8N70o3ud-11" target="9bJN26KlkBRv8N70o3ud-23">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="220" y="600" as="sourcePoint" />
            <mxPoint x="270" y="550" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="9bJN26KlkBRv8N70o3ud-30" value="" style="endArrow=none;html=1;rounded=0;" edge="1" parent="1" source="9bJN26KlkBRv8N70o3ud-11" target="9bJN26KlkBRv8N70o3ud-25">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="220" y="600" as="sourcePoint" />
            <mxPoint x="270" y="550" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="9bJN26KlkBRv8N70o3ud-31" value="" style="endArrow=none;html=1;rounded=0;" edge="1" parent="1" source="9bJN26KlkBRv8N70o3ud-21" target="9bJN26KlkBRv8N70o3ud-9">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="220" y="400" as="sourcePoint" />
            <mxPoint x="270" y="350" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="9bJN26KlkBRv8N70o3ud-32" value="" style="endArrow=none;html=1;rounded=0;" edge="1" parent="1" source="9bJN26KlkBRv8N70o3ud-8" target="9bJN26KlkBRv8N70o3ud-16">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="220" y="200" as="sourcePoint" />
            <mxPoint x="270" y="150" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="9bJN26KlkBRv8N70o3ud-33" value="" style="endArrow=none;html=1;rounded=0;" edge="1" parent="1" source="9bJN26KlkBRv8N70o3ud-8" target="9bJN26KlkBRv8N70o3ud-13">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="220" y="200" as="sourcePoint" />
            <mxPoint x="270" y="150" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="9bJN26KlkBRv8N70o3ud-34" value="" style="endArrow=none;html=1;rounded=0;" edge="1" parent="1" source="9bJN26KlkBRv8N70o3ud-8" target="9bJN26KlkBRv8N70o3ud-12">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="220" y="200" as="sourcePoint" />
            <mxPoint x="270" y="150" as="targetPoint" />
          </mxGeometry>
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>
